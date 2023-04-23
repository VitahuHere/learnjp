import { Link } from "react-router-dom"
import { ButtonRow } from "../ButtonRow/ButtonRow"


export function Home() {
  const endpoints = [
    { path: "/hiragana", text: "Hiragana", description: "Learn Hiragana characters" },
    { path: "/words", text: "Words", description: "Learn Japanese words" }
  ]

  return (
    <div className="flex flex-col h-screen w-screen bg-zinc-900">
      <header className="text-4xl pt-5 font-bold text-white text-center">Learn Japanese</header>
      <main className="flex flex-col justify-center items-center h-full">
        <h1 className="text-white">Hishis</h1>
        <div className="flex space-x-6">
          <ButtonRow paths={endpoints} />
        </div>
      </main>
      <footer className="text-white align-text-bottom">asldfkjs</footer>
    </div>
  )
}