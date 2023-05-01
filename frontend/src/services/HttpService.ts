import axios from 'axios';


export async function fetchCards(){
  const response = await axios.get("http://localhost:8081/api/v1/cards");
  return response.data.map((card: Card) => {
    return {
      id: card.id,
      hiragana: card.hiragana,
      romaji: card.romaji,
      english: card.english,
      definition: card.englishDefinition
    }
  });
}

export async function fetchRandomCard(){
  const response = await axios.get("http://localhost:8081/api/v1/cards/random");
  return {
    id: response.data.id,
    hiragana: response.data.hiragana,
    romaji: response.data.romaji,
    english: response.data.english,
    definition: response.data.englishDefinition
  }
}

export async function submitAnswer(answer: HiRomaji){
  const response = await axios.post("http://localhost:8081/api/v1/cards", answer);
  console.log(response.data);
}