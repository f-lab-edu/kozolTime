# kozolTime
대학생들이 사용하는 에브리타임의 소속감과 정보력이 부러워서 만들게 된 고졸들의 커뮤니티 어플입니다.
네가지 페이지를 구상했습니다.
1. 고졸로써 취업한 선배들이 썰을 푸는 페이지
2. 유저들을 바로 채용할 수 있게 만든 구인구직란
3. 마이페이지
4. 고졸 취준생들의 고민을 나눌수 있는 고민 페이지

## 사용 기술 
### Firebase : Firestore
백엔드 서버 플랫폼
유저들의 글을 공유하기 위해서 백엔드 서버의 필요성을 느꼈습니다.
백엔드 서버를 선택할 때 오프라인 지원, 실시간 업데이트, 어플 분석이 동시에 가능한 플랫폼을 선택하고자 했습니다.
여러 백엔드 서비스 플랫폼를 비교한 결과 앞의 기능을 모두 제공하는 Firebase로 결정했습니다.

Firestore
Firebase 플랫폼의 Realtime database가 아닌 Firestore를 선택한 이유는 Firestore가 쿼리 기능이 더 발달하였기 때문입니다.
Realtime database는 쿼리를 동시에 정렬하고 필터링 할 수 없지만 Firestore는 동시에 가능합니다.

###Kotlin
간결성
data를 담을때 data class를 사용했습니다. 필요한 메서드를 암시적으로 만들어주어 가독성이 좋았습니다.
자바처럼 함수로 따로 지정하거나 익명객체를 만들어줄 필요없이 람다를 사용해 코드를 인자에 직접 넣어줌으로써 간결하게 사용했습니다.
수신 객체 지정 람다를 사용하여 객체를 중복하지 않고 호출했습니다.

안정성
널이 될 수 없는 타입과 널이 될 수 있는 타입이 나뉘어 널이 될 수 없는 타입만 처리해주면 되어 편리했습니다.
그에 맞는 안전한 호출 연산자(?.)나 널 아님 단언 연산자(!!)로 널을 안전하게 처리할 수 있었습니다.

###Github
GitFlow
초반에 GitFlow를 적용했을 때 브랜치와 커밋의 개념을 잘 이해하지 못해서 feature 브랜치에서 feature 브랜치를 만들기도 하였습니다.
브랜치들의 역할을 다시 공부하여 역할대로 브랜치를 올바르게 사용하였습니다.

풀리퀘스트
로컬 레포지토리에서 기능을 구현하고 풀리퀘스트에 업로드해 멘토님과 더 좋은 코드를 짜기 위해 의견을 주고 받고 더 나은 코드로 고친다음 merge 하였습니다. 왜 이런 코드를 짠건지 어떻게 짜면 더 효율적일지 커뮤니케이션하며 더 좋은 코드를 짜기 위해서 노력했습니다.

###Glide
기능
다른 라이브러리보다 이미지 로딩 속도가 빠르고 메모리를 적게 점유합니다.
error()를 사용하여 이미지가 null일 때 보여줄 이미지를 설정했습니다.
placeholder()를 사용하여 이미지 로딩을 시작하기 전에 보여줄 이미지를 설정했습니다.
fallback()을 사용하여 load할 url이 null인 경우 비어있을 때 보여줄 이미지를 설정했습니다.

###AAC
Viewmodel
Firebase에서 가져온 값을 소유해줄 클래스로 Viewmodel을 사용했습니다.
액티비티나 프래그먼트에서 값을 직접가져오지 않고 ViewModel에서 값을 받아와 과도한 책임을 분담할 수 있었습니다.
LiveData
ViewModel안의 데이터가 업데이트 되면 observer로 값을 업데이트 해주기 위해서 사용했습니다.
최신 데이터를 유지 할 수있었습니다.


## 프로젝트 목표
1. 앱을 출시하는 것
2. 고졸분들께 도움이 되는 어플
