import { Paths } from "../paths"
import { ButtonRow } from "../components/ButtonRow/ButtonRow"
import { Footer } from "../components/Footer/Footer"


export default function HiraPickPage() {
  const endpoints = [
    { path: Paths.hiraRoma, text: "Hiragana to Romaji", description: "Read Hiragana and write in Romaji" },
    { path: Paths.romaHira, text: "Romaji to Hiragana", description: "Read Romaji and write in Hiragana" }
  ]

  return (
    <div className="flex flex-col h-screen w-screen bg-zinc-900">
      <header className="text-5xl pt-5 font-bold text-white text-center">Learn Japanese Hiragana</header>
      <main className="flex flex-col justify-center items-center text-center h-full">
        <h1 className="text-white py-16 text-3xl">Choose your learning mode:</h1>
        <div className="flex space-x-6">
          <ButtonRow paths={endpoints} />
        </div>
      </main>
      <Footer />
    </div>
  )
}