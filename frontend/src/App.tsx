import { Route, Routes } from "react-router-dom"
import { Home } from "./components/Home/Home"
import { NotFound } from "./components/404/NotFound"

function App() {

  return (
    <Routes>
      <Route path="/" element={<Home />} />
      <Route path="/hiragana">
        <Route index element={<h1>Hiragana</h1>} />
        <Route path="jp-to-pl" element={<h1>jp-pl</h1>} />
        <Route path="pl-to-jp" element={<h1>pl-jp</h1>} />
      </Route>
      <Route path="/words" element={<h1>Words</h1>}/>
      <Route path="*" element={<NotFound/>} />
    </Routes>
  )
}

export default App
