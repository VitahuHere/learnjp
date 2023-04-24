import { useState } from "react"



export default function Card(){
  const [text, setText] = useState("さございますありがとうございますありがとうございます")

  return (
    <div className="flex flex-col space-y-10">
      <div className="flex justify-center items-center min-w-fit max-w-lg min-h-fit max-h-[300px] bg-white text-[48px] rounded-md">
        {text}
      </div>
      <div className="flex flex-col space-y-5">
        <input type="text" placeholder="answer" className="h-10 w-auto text-center rounded-md"></input>
        <input type="button" value="Submit" className="h-10 w-auto bg-white hover:bg-slate-400 rounded-md"></input>
      </div>
    </div>
  )
}