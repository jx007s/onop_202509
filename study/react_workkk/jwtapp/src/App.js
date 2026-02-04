

function App() {

  let bk = 'http://192.168.0.78:8080/QWER/'
  bk = 'http://192.168.0.78/'

  function loginGo(){


    fetch(
      `${bk}login`,
      {
        method:"POST",
        headers:{
          "Content-Type" : "application/json"
        },
        body: JSON.stringify({
          username: "aaa",
          password : "1111"
        })
      }
    )
    .then(response=> response.json())
    .then(data=>{
        console.log("로그인 성공")
        console.log(data)

        //토큰저장
        localStorage.setItem("token", data.token)
    })
    .catch(error=>{
      console.log(`로그인 실패 `)
    })
  }

  function logChk(){

    const token = localStorage.getItem("token")

    if(token){  //토큰이 있을 경우에만 진입
        fetch(
          `${bk}hello`,
          {
            method:"GET",
            headers:{
              "Authorization" : `Bearer ${token}`
            }
          }
        )
        .then(response=>{
          //console.log(`logChk 결과 : `, response.text())
          return response.text()
        })
        .then(data=>{
         console.log(`logChk 결과 : `, data)
        })
        .catch(error=>{
          console.log(`logChk 에러 : `, error)
        })
    }else{
      console.log("토큰없음")
    }
  }

  async function logOut(){
    const token = localStorage.getItem("token")

    if(token){  //토큰이 있을 경우에만 진입
        await fetch(
          `${bk}hello`,
          {
            method:"GET",
            headers:{
              "Authorization" : `Bearer ${token}`
            }
          }
        )
        .then(response=>{
          return response.text()
        })
        .then(data=>{
          localStorage.removeItem("token")
          alert(data +" 로그아웃")
        })
        .catch(error=>{
          console.log(`logChk 에러 : `, error)
        })
    }else{
      console.log("토큰없음")
    }

    
  }


  return (
    <>
      <h1>프론트 로그인 페이지</h1>
      <button onClick={loginGo}>로그인시도</button>
      <button onClick={logChk}>로그인확인</button>
      <button onClick={logOut}>로그아웃</button>
    </>
  );
}

export default App;
