'use client'; // 서버 컴포넌트, 클라이언트 컴포넌트

export default function Home() {

  fetch('http://localhost:8080/posts')
  .then((res) => res.json())
  .then((data) => {
    console.log(data);
  })
  .catch(() => {
    console.log("error 발생");
  });

  return <div>
    <h1>Main 페이지</h1>
    <ul>
      <li>post1</li>
      <li>post2</li>
      <li>post3</li>
    </ul>
  </div>;
}
