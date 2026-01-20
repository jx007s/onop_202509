import React from 'react';

function UploadForm(props) {
    const submitGo=(e)=>{
        e.preventDefault()
        //alert('가즈아')

        const myData = new FormData(e.target)  // 현재 폼 정보들을 가져온다

        fetch("http://192.168.0.78:8080/reg3",{
            method:'POST',
            body:myData
            }).then(response=>response.text())
            .then(dd=>{
                console.error(`성공 : ${dd}`)    
            })
            .catch(err=>{
                console.error(`에러 : ${err}`)
               
            })
    }


    return (
        <>
            <h1>리액트 업로드</h1>
            <form onSubmit={submitGo} enctype="multipart/form-data">
            <table border="">
                <tr>
                    <td>이름</td>
                    <td><input type="text" name="pname" /></td>
                </tr>
                <tr>
                    <td>나이</td>
                    <td><input type="text" name="age" /></td>
                </tr>
                <tr>
                    <td>파일1</td>
                    <td><input type="file" name="ff1" multiple /></td>
                </tr>
                <tr>
                    <td>파일2</td>
                    <td><input type="file" name="ff2" /></td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="가입" />
                    </td>
                </tr>
            </table>
        </form>

            
        </>
    );
}

export default UploadForm;