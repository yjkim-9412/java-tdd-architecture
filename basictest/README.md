# 유스케이스: 학생의 기초검사 결과를 저장한다.

## 액터: 관리자

<label> 기초 테스트 종류</label>
<ul>
    <li>학습 습관검사</li>
    <li>독서 기초검사</li>
    <li>지능검사</li>
</ul>

## 주요 성공 시나리오

<body>
    <h3> 학습 습관검사 저장</h3>
        <ol>
            <li>결과를 입력할 기존 학생의 학습 습관검사 정보를 요청한다.</li>
            <li>결과가 입력된 정보를 저장 요청한다.</li>
            <li>학습 습관검사 유형별로 분류한다.</li>
            <li>유형별 총점수를 계산한다.</li>
            <li>해당 학생의 학습 습관검사 정보를 요청한다.</li>
            <li>결과가 존재 할 시 덮어씌운다.</li>
            <li>처리된 결과를 제공한다</li>
        </ol>
    <h3> 독서 기초검사 저장</h3>
        <ol>
            <li>결과를 입력할 기존 학생의 학습 습관검사 정보를 요청한다.</li>
            <li>결과가 입력된 정보를 저장 요청한다.</li>
            <li>테스트한 도서 정보를 검증한다.</li>
            <li>총점수를 계산한다.</li>
            <li>해당 학생의 독서 기초검사 정보를 요청한다.</li>
            <li>결과가 존재 할 시 덮어씌운다.</li>
            <li>처리된 결과를 제공한다</li>
        </ol>
    <h3> 지능검사 저장</h3>
        <ol>
            <li>결과를 입력할 기존 학생의 학습 습관검사 정보를 요청한다.</li>
            <li>결과가 입력된 정보를 저장 요청한다.</li>
            <li>지능검사 대분류를 검증한다</li>
            <li>소분류를 검증한다</li>
            <li>대분류 총점수를 계산한다.</li>
            <li>해당 학생의 지능검사 정보를 요청한다.</li>
            <li>결과가 존재 할 시 덮어씌운다.</li>
            <li>처리된 결과를 제공한다</li>
        </ol>
    <h2>처리 공통 부분</h2>
        <ul>
            <li>특정 검증이 필요하다.</li>
            <li>총점수를 계산한다.</li>
            <li>기존정보 존재시 덮어씌운다.</li>
        </ul>
     <h2>예상된 예외</h2>
        <ul>
            <li>분류 일치 검증</li>
            <li>관리자 인가 접근</li>
            <li>학생 유무 검증</li>
            <li>도서 유무 검증</li>
            <li>문제수 검증</li>
        </ul>
</body>