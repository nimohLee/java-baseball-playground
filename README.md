## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```


## TODO
[O] 메인 클래스에 게임이 종료될 때까지 진행되는 while loop 생성
[O] 야구 공의 번호와 위치를 가지고 있는 객체 생성 (Ball)
    - [O] 최대 2(0~2)의 위치와 값을 가짐 (position, value)
[] 랜덤 야구공을 3자리를 만들어 주는 객체 생성 (BallGenerator)
    - [] 랜덤 야구공 생성 하는 생성자 ( 0 ~ 9의 서로 다른 숫자와 0 ~ 2의 위치)
    - [] 랜덤 야구공을 가져 오는 메서드 (generate)
[] 사용자가 입력한 값을 심판하는 객체 생성 (Referee)
    - [] 유효한 값인 지 확인 (validate)
    - [] 입력된 야구공 조합과 정답을 비교하여 정답 유무 판단 (judge)
[] 정답인 경우 게임 다시 시작하거나 종료
[] 각 단위 별 테스트 코드 생성
