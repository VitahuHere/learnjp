import axios from 'axios';
import { root } from '../paths';


export async function fetchCards(){
  const response = await axios.get(root + "/cards");
  return response.data.map((card: HiraganaCard) => {
    return {
      id: card.id,
      hiragana: card.hiragana,
      romaji: card.romaji,
      english: card.english,
      definition: card.englishDefinition
    }
  });
}

export async function fetchRandomHiraganaCard(){
  const response = await axios.get(root + "/cards/random");
  return {
    id: response.data.id,
    hiragana: response.data.hiragana,
    romaji: response.data.romaji,
    english: response.data.english,
    definition: response.data.englishDefinition
  }
}

export async function submitAnswer(answer: HiRomaji){
  const response = await axios.post(root + "/cards", answer);
}