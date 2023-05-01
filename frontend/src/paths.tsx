import { BrowserRouter, Route, Routes } from "react-router-dom"
import { lazy } from "react"

export const root = 'http://192.168.1.40:8081/api/v1'

export const Paths = {
  hiragana: '/hiragana',
  hiraRoma: 'hira-roma',
  romaHira: 'roma-hira',
  words: '/words',
}

const Home = lazy(() => import('./pages/Home'))
const HiraPickPage = lazy(() => import('./pages/HiraPickPage'))
const NotFound = lazy(() => import('./pages/NotFound'))
const HiraganaPage = lazy(() => import('./pages/HiraganaPage'))


export default function Router() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path={Paths.hiragana}>
          <Route index element={<HiraPickPage />} />
          <Route path={Paths.hiraRoma} element={<HiraganaPage />} />
          <Route path={Paths.romaHira} element={<HiraganaPage />} />
        </Route>
        <Route path={Paths.words} element={<HiraganaPage />} />
        <Route path="*" element={<NotFound />} />
      </Routes>
    </BrowserRouter>
  )
}