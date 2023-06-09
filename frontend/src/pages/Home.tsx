import { ButtonRow } from "../components/ButtonRow/ButtonRow"
import { Footer } from "../components/Footer/Footer"
import { Paths } from "../paths"


export default function Home() {
  const endpoints = [
    { path: Paths.hiragana, text: "Hiragana", description: "Learn Hiragana characters" },
    { path: Paths.words, text: "Words", description: "Learn Japanese words" }
  ]

  return (
    <div className="flex flex-col h-screen w-screen bg-zinc-900">
      <header className="text-5xl pt-5 font-bold text-white text-center">Learn Japanese</header>
      <main className="flex flex-col justify-center items-center h-full">
        <h1 className="text-white py-16 text-3xl">Choose your learning mode:</h1>
        <div className="flex space-x-6">
          <ButtonRow paths={endpoints} />
        </div>
      </main>
      <Footer />
    </div>
  )
}