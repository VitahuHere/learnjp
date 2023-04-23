import { Link } from "react-router-dom";


export function ButtonRow({ paths }: { paths: ButtonLink[] }) {
  return (
    <>
      {
        paths.map((path) => {
          return (
            <div className="flex flex-col space-y-5 w-64 items-center">
              <label className="text-white text-xl">{path.description}</label>
              <Link to={path.path} className="w-full h-fit p-5 text-center text-4xl text-blue-100 no-underline bg-red-500 rounded hover:bg-blue-50 hover:underline hover:text-red-500">{path.text}</Link>
            </div>
            )
        })
      }
    </>
  )
}
