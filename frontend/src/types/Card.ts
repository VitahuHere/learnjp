type HiraganaCard = {
  id: number;
  hiragana: string;
  romaji: string;
  english: string;
  englishDefinition: string;
}

type Card = {
  title: string,
  fetchQuestion: () => object,
  submitAnswer: () => void
}