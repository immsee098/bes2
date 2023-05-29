# 7주차 - 4강 Relationship Mapping

### Relationship Mapping
* 데이터 모델 Entity의 관계를 객체 참조로 간단히 활용할 수 있게 해줌

### N + 1 problem
* 정된 엔티티를 조회할 경우에 조회된 데이터 갯수(n) 만큼 연관관계의 조회 쿼리가 추가로 발생하여 데이터를 읽어오게 된다. 
* person하고 item이 있으면 두 개 중심으로 어떤 객체 지향 설계를 해야하나 고민해야함
  
* DDD의 Aggregate
* `CascaseType.ALL`
  * 부모 엔티티를 다루면 자식 엔티티까지 삭제하는 등의 일
* `orphanRemoval`
  * Cascase.Remove로 연관이 끊긴 자식 객체를 바로 삭제해주는 설정
### Event Sourcing
  * 모든 상태를 일으키는 이벤트를 순서에 맞게 저장하여 status를 만들어내는 방법
  * [참고 이미지](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbF2oCK%2FbtrKdQ7nfTI%2FUJumUEpHkkUd7hZvF0kZGk%2Fimg.png)
  
* JPA 어노테이션
  * @OneToMany
  * @JoinColumn