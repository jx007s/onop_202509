import { useEffect, useState } from "react";


function App() {


  const [data,setData] = useState("로딩중")

  useEffect(()=>{
    fetch("http://192.168.0.78:8080/",{
      headers:{
        'Content-Type':'application/json'
      }
    }).then(response=>response.json())
    .then(dd=>{
      let vv = (<table border="">
        <tr>
          <td>이름</td>
          <td>국어</td>
          <td>영어</td>
          <td>수학</td>
          <td>총점</td>
          <td>평균</td>
        </tr>
      {dd.map((st,i)=>(
        <tr key={i}>
          <td>{st.name}</td>
          <td>{st.kor}</td>
          <td>{st.eng}</td>
          <td>{st.mat}</td>
          <td>{st.tot}</td>
          <td>{st.avg}</td>
        </tr>
      ))}
      
      </table>)

      setData(vv)
       //setData(dd)
      console.log(dd)

    })
    .catch(err=>{
      console.error(`에러 : ${err}`)
      setData('로딩중')
    })
  },[])

  return (
    <>
      <h1>examprj 입니다</h1>
      {data}
    </>
  );
}

export default App;
