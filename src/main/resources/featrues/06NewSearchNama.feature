Feature: User Search Data Kandidat
  #1
  Scenario: User dapat mencari data kandidat dengan nama valid
#    Given User berhasil masuk ke dalam new page
    When User memasukkan data nama kandidat ke search field
    And User klik search button
    Then Data nama kandidat berhasil ditampilkan
    When User klik refresh button
    Then Data kandidat berhasil direfresh

  #data
#    Examples:
#    | Data |
#    |RIFKI|
#    |1231221321321|
#    |KOTA YOGYAKARTA|
#    |safdaf|
#    |Siloam Clinic Meruya|

