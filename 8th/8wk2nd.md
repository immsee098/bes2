# 8주차 - 2강 Strategic Design

* 전략적 설계 & 전술절 설계
  * 전략적 설계가 전술적 설계의 선행이 되기도 함

### 전략적 설계
* 보편언어 (Ubiqutious Language)
  * 어떤 맥락을 의미함
* 제한된 컨텍스트 (Bounded Context)
  * 어떤 보편 언어를 쓰는 사람들이 제한된 컨텍스트 안에서 같이 일함
  * micro service
  * 시스템 나눌 때 쓺
* 하위 도메인 (Subdomain)
  * 도메인 자체를 나눔(상품 관리/배송/등등..)
* 제한된 컨텍스트 vs 하위도메인
  * 전자는 소프트웨어 조직화
  * 후자는 부서단위
  * 나누는 이유: 어디에 집중해야할지 알 수 있어서