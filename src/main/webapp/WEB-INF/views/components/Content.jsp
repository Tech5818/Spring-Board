<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<div class="flex flex-auto justify-center items-center">
    <form
            action="/login" method="post"
            class="w-[500px] h-[600px] shadow-[0_0_10px_-3px_rgba(0,0,0,0.5)] bg-[#fff] flex flex-col p-[20px]">
        <h1 class="text-[32px] font-bold text-center">회원가입</h1>

        <div class="flex flex-col gap-[10px]">
            <input type="text" placeholder="이름을 입력하세요." name="name"
                   class="border-[#aaa] border-[1px] border-solid focus:outline-none p-[8px_16px] rounded-full" />
            <input type="email" placeholder="example@gmail.com" name="email"
                   class="border-[#aaa] border-[1px] border-solid focus:outline-none p-[8px_16px] rounded-full" />
        </div>
    </form>
</div>
