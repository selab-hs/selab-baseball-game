# SE-LAB BASEBALL

### 1. 요구사항
> 추가적인 기능 구현 환영! 물론, 필수적인 구현은 무조건~
0. 상대방은 컴퓨터이며, 숫자게임에 필요한 값을 랜덤하게 생성해야 한다.
    - `456` 이런식으로 랜덤하게~
    - 사용자는 컴퓨터가 생성한 랜덤 값을 알 수 없다.
1. 사용자로부터 1에서 9사이의 중복되지 않는 숫자 3개를 입력받는다.
    - `321`이런식으로!
2. 입력 받은 것에 대한 야구게임 결과를 출력한다.
    - 사용자가 입력한 값에 컴퓨터가 생성한 값이 들어 있으면 ball
    - 사용자가 입력한 값에 컴퓨터가 생성한 값이 들어 있으면서, 같은 위치에 있다면 strike
3. 출력은 ball과 strike 개수를 출력한다.
   - 컴퓨터가 생성한 값이 `456`일때, 사용자가 `754`라면 `1 ball / 1 strike`을 출력한다.
   - 컴퓨터가 생성한 값이 `456`일때, 사용자가 `456`을 입력하면, `BASEBALL WIN~!`을 출력한다.
4. 사용자가 컴퓨터의 랜덤값을 맞출때 까지 게임은 계속된다.
5. README에 요구사항을 꼭 적는다!
---

### 2. 구현 목표
1. `Main`에서 `GetRandomValue`메소드를 호출하여 랜덤한 값 생성 (123, 456 등...)
   - ~~`ArrayList` 사용하여 `Stream`의 `.filter` 이용해보자~~
2. `Getinputvalue`로 값을 계속 받아온다 **언제까지?** 컴퓨터가 생성한 랜덤 값과 동일할 때 까지
   - `While`문 안에 `Getinputvalue`와 `CheckValue`를 넣어줘 계속해서 비교
   - 컴퓨터가 생성한 랜덤 값과 사용자가 입력한 값이 동일하다면 `BASEBALL WIN~!` - 종료
   - 동일하지 않은 경우 야구게임 규칙에 따라 `? ball/ ? strike` 출력

### 3. 구현 내용
1. `Main`에서 `PlayBaseballGame`메소드를 호출
2. `PlayBaseballGame`에서 난수(`randomValue`) 생성
   - 난수를 보여줍니다 (오류 방지 테스트를 직접 하기 위함)
3. `While`문으로 `getInputValue()` 및 `checkValue()`를 반복해줍니다.
   - `getInputValue()` : `scanner.NextLine()` 으로 값을 받아줍니다 (inputValue를 반복해서 입력 받아야 하기 때문)
   - `BaseballGame` : 숫자야구의 규칙이 담겨있습니다. 규칙에 따라 `BASEBALL WIN~!` or `? ball/ ? strike` 을 출력해줍니다.
4. `checkAnswer`에서 `System.exit()`으로 while문 탈출
