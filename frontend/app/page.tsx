"use client";
import { useEffect, useState } from "react";

// 서버 컴포넌트, 클라이언트 컴포넌트

type Post = {
  id: number;
  title: string;
  content: string;
};

export default function Home() {
  // let posts = [];
  const [posts, setPosts] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/posts")
      .then((res) => res.json())
      .then((data) => {
        setPosts(data);
      })
      .catch(() => {
        console.log("error 발생");
      });
  }, []);

  return (
    <div>
      <h1>Main 페이지</h1>
      <ul>
        {posts.map((post: Post) => {
          return <li key={post.id}>{post.title}</li>;
        })}
      </ul>
    </div>
  );
}
