import { useEffect, useState } from "react"
import { fetchRandomCard, submitAnswer } from "../../services/HttpService";



export default function Card() {
  const [card, setCard] = useState({ id: 0, hiragana: "", romaji: "", english: "", definition: "" });

  useEffect(() => {
    updateCard();
  }, []);

  function updateCard() {
    fetchRandomCard().then(
      (card) => {
        setCard(card);
      }
    )
  }

  function handleSubmit(event: React.FormEvent<CardFormElement>) {
    event.preventDefault();
    updateCard();
    const inputAnswer = event.currentTarget.answer.value;
    if (card.romaji === inputAnswer) {
      alert("Correct!");
    }
    const answer: HiRomaji = {
      id: card.id,
      romaji: inputAnswer
    }
    submitAnswer(answer);
  }

  return (
    <div className="flex flex-col space-y-10">
      <h1 className="text-white text-center text-4xl">Write this in Romaji!</h1>
      <div className="flex justify-center items-center max-w-xl bg-white rounded-md">
        <span className="text-4xl py-5">{card.hiragana}</span>
      </div>
      <form className="flex flex-col space-y-5" onSubmit={handleSubmit} >
        <input type="text" placeholder="answer" className="h-16 w-auto text-center rounded-md" name="answer"></input>
        <input type="submit" className="h-10 w-auto bg-white hover:bg-slate-400 rounded-md"></input>
      </form>
    </div>
  )
}