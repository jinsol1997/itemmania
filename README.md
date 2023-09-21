# Hitem Broker Project
Open Api를 활용한 공공 빅데이터 자바 개발자 양성과정의 최종 프로젝트 입니다. <br>
기존에 있는 아이템매니아 사이트의 일부 기능을 클론코딩하였습니다. <br>
해당 README.md 에는 작성자 본인(jinsol1997)이 사용한 기술스택 및 코드에 대한 내용만을 기재하였습니다. <br>

작업자 : [@dabinHam](https://github.com/dabinHam "@dabinHam"), [@DongWon1215](https://github.com/DongWon1215 "@DongWon1215"), [@jinsol1997](https://github.com/jinsol1997 "@jinsol1997"), [@jennakim1007](https://github.com/jennakim1007 "@jennakim1007"), [@kimjuhwan7](https://github.com/kimjuhwan7 "@kimjuhwan7")

ppt : https://docs.google.com/presentation/d/1lIRHewRfvdq1q2koqZsPa0OkzEHTo0WO/edit?usp=sharing&ouid=100677545251509369967&rtpof=true&sd=true
<br>


## 사용한 기술스택

* JAVA 17
* Spring Boot
* Spring Data Jpa
* Mybatis
* Thymeleaf
* Mysql


## 구현 기능

* 결제 (마일리지 충전)
  * iamport api를 활용한 카카오페이, 토스페이, 네이버페이, 삼성페이, lpay, SSG페이, 휴대폰 소액결제, 카드결제, 엑심베이(달러기준, 테스트용 카드 필요), 문화상품권, 스마트문화상품권, 해피머니상품권, 도서문화상품권, 카드 포인트 가상 결제 구현
  * 비동기 처리(axios) 및 모듈화(Thymeleaf fragment)
  * (카카오페이를 제외한 상기 테스트 결제들은 모두 실제 화폐가 결제되며, 24시간 내 취소 처리 됩니다. 테스트 진행 시 주의)
![image](https://github.com/jinsol1997/higg_v2/assets/113006954/353f5ab8-f761-42f2-8a03-934fa9ff3039)

 * 마이페이지 -> 마일리지 상세내역 조회 (결제, 회원간 거래, 프리미엄 등록권 구매)
   * 동적 html
   * 페이징
   * 비동기 처리
![image](https://github.com/jinsol1997/higg_v2/assets/113006954/ad539452-b8c3-4acd-bc43-7c1a93966b84)

  * 아이템 (프리미엄 등록권)
    * 기본적인 CRUD

   
## DB 설계
  
![image](https://github.com/jinsol1997/higg_v2/assets/113006954/562c909a-6462-451c-8a7e-184d5c2264f3)


## 발생 이슈 및 해결방법

* 데이터 신뢰성 이슈

기존 DB 구조 상에서는 사이트 내 재화인 mileage를 user table에 column으로 두고 결제, 구매, 거래 table에 mileage 변동 기록을 담았습니다.
하지만 예상치 못한 이유로 user table의 현재 mileage 값과
결제, 구매, 거래 table 상의 mileage 변동 기록을 토대로 계산한 현재 mileage 값이 서로 다를 경우,
둘 중 어느쪽 데이터를 신뢰할 것이냐 하는 데이터 신뢰성 이슈가 발생하였습니다.
따라서 DB상에서 mileage 값을 직접 입력해 넣는 방식은 위험하다고 판단하였습니다.

* 해결 방안

user table에서 mileage를 column으로 갖지 않도록 수정하고
mileage 변동 기록을 갖고 있는 table들에서 기록들을 가져와 연산하여 현재 mileage 값을 추출하는 방식으로 변경하여 해결했습니다.


[contributors-shield]: https://img.shields.io/github/contributors/othneildrew/Best-README-Template.svg?style=for-the-badge
[contributors-url]: https://github.com/othneildrew/Best-README-Template/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/othneildrew/Best-README-Template.svg?style=for-the-badge
[forks-url]: https://github.com/othneildrew/Best-README-Template/network/members
[stars-shield]: https://img.shields.io/github/stars/othneildrew/Best-README-Template.svg?style=for-the-badge
[stars-url]: https://github.com/othneildrew/Best-README-Template/stargazers
[issues-shield]: https://img.shields.io/github/issues/othneildrew/Best-README-Template.svg?style=for-the-badge
[issues-url]: https://github.com/othneildrew/Best-README-Template/issues
[license-shield]: https://img.shields.io/github/license/othneildrew/Best-README-Template.svg?style=for-the-badge
[license-url]: https://github.com/othneildrew/Best-README-Template/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/othneildrew
[product-screenshot]: images/screenshot.png
[Next.js]: https://img.shields.io/badge/next.js-000000?style=for-the-badge&logo=nextdotjs&logoColor=white
[Next-url]: https://nextjs.org/
[React.js]: https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB
[React-url]: https://reactjs.org/
[Vue.js]: https://img.shields.io/badge/Vue.js-35495E?style=for-the-badge&logo=vuedotjs&logoColor=4FC08D
[Vue-url]: https://vuejs.org/
[Angular.io]: https://img.shields.io/badge/Angular-DD0031?style=for-the-badge&logo=angular&logoColor=white
[Angular-url]: https://angular.io/
[Svelte.dev]: https://img.shields.io/badge/Svelte-4A4A55?style=for-the-badge&logo=svelte&logoColor=FF3E00
[Svelte-url]: https://svelte.dev/
[Laravel.com]: https://img.shields.io/badge/Laravel-FF2D20?style=for-the-badge&logo=laravel&logoColor=white
[Laravel-url]: https://laravel.com
[Bootstrap.com]: https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white
[Bootstrap-url]: https://getbootstrap.com
[JQuery.com]: https://img.shields.io/badge/jQuery-0769AD?style=for-the-badge&logo=jquery&logoColor=white
[JQuery-url]: https://jquery.com 
