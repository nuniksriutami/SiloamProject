Feature: User Search Data tujuan Kandidat
  #1
  Scenario: User dapat mencari data kandidat dengan tujuan valid
    When User memasukkan data tujuan kandidat ke search field
    And User klik search button
    Then Data tujuan kandidat berhasil ditampilkan
    When User klik refresh button