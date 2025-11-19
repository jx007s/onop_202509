import PropStud from "./prop/funcStud"
import './prop2.css'
let arr = [
    {pname:'현빈', jum:[87,88,81]},
    {pname:'원빈', jum:[57,58,51]},
    {pname:'투빈', jum:[67,68,61]},
    {pname:'텅빈', jum:[97,98,91]},
    {pname:'커피빈',jum:[77,78,71]}
]


function ewfwfwef(){
    return <>
        <h1>학생목록</h1>
        <section>
        {arr.map((v,k)=><PropStud dd={v} key={k} />)}
        </section>
    </>
}

export  default  ewfwfwef