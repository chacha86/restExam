"use client";
import { useState } from "react";

export default function PostForm() {
  const [title, setTitle] = useState("");
  const [content, setContent] = useState("");

  function savePost() {
    fetch("http://localhost:8080/posts", {
      method: "POST",
      headers: {
        "Content-type": "application/json",
      },
      body: JSON.stringify({ title: title, content: content }),
    }).then((res) => {
      if (res.ok) console.log("게시물 등록 성공");
    });
  }

  return (
    <>
      <input
        type="text"
        value={title}
        placeholder="제목 입력"
        onChange={(e) => {
          setTitle(e.target.value);
        }}
      />
      <input
        type="text"
        value={content}
        placeholder="내용 입력"
        onChange={(e) => {
          setContent(e.target.value);
        }}
      />
      <button onClick={savePost}>등록</button>
    </>
  );
}
