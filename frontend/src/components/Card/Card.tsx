import { useEffect, useRef, useState } from "react"
import { fetchRandomHiraganaCard, submitAnswer } from "../../services/HttpService";



export default function Card() {
  const [card, setCard] = useState({ id: 0, hiragana: "", romaji: "", english: "", definition: "" });
  const [questionBgColor, setquestionBgColor] = useState("bg-white");

  useEffect(() => {
    updateCard();
  }, []);

  const answerBox = useRef<HTMLInputElement>(null);

  function updateCard() {
    fetchRandomHiraganaCard().then(
      (card) => {
        setCard(card);
      }
    )
  }

  function validate(answer: string) {
    if (card.romaji === answer.toLowerCase()) {
      setquestionBgColor("bg-green-700");
    }
    else {
      setquestionBgColor("bg-red-700");
    }
    setTimeout(() => {
      setquestionBgColor("bg-white");
    }, 500);
    if (answerBox.current != null) {
      answerBox.current.value = "";
    }
  }

  function handleSubmit(event: React.FormEvent<CardFormElement>) {
    event.preventDefault();
    updateCard();
    const inputAnswer = event.currentTarget.answer.value;
    validate(inputAnswer);
    const answer: HiRomaji = {
      id: card.id,
      romaji: inputAnswer
    }
    submitAnswer(answer);
  }

  return (
    <div className="flex flex-col space-y-10">
      <h1 className="text-white text-center text-4xl">Write this in Romaji!</h1>
      <div className={"flex justify-center items-center max-w-xl rounded-md " + (questionBgColor)}>
        <span className="text-4xl py-5">{card.hiragana}</span>
      </div>
      <form className="flex flex-col space-y-5" onSubmit={handleSubmit} >
        <input type="text" placeholder="answer" className="h-16 w-auto text-center rounded-md" name="answer" ref={answerBox}></input>
        <input type="submit" className="h-10 w-auto bg-white hover:bg-slate-400 rounded-md"></input>
      </form>
    </div>
  )
}