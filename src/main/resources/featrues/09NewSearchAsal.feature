Feature: User Search Data asal Kandidat
  #1
  Scenario: User dapat mencari data kandidat dengan asal valid
    When User memasukkan data asal kandidat ke search field
    And User klik search button
    Then Data asal kandidat berhasil ditampilkan
    When User klik refresh button