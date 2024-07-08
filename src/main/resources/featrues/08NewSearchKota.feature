Feature: User Search Data kota Kandidat
  #1
  Scenario: User dapat mencari data kandidat dengan kota valid
    When User memasukkan data kota kandidat ke search field
    And User klik search button
    Then Data kota kandidat berhasil ditampilkan
    When User klik refresh button