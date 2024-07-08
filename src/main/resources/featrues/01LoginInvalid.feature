Feature: Proses User Login Dengan Invalid Kredensial
  # 1
  Scenario Outline: User dapat berhasil login dengan menggunakan kredensial yang valid
    Given User mengakses halaman login
    When User memasukan <password> and <username>
    And User klik tombol login
    Then User berada di login page


    #6 data
    Examples:
      | username | password  |
      | Admin    ||
      || adminn123 |
      |||
