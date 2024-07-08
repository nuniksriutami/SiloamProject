Feature: User Search Data nomor Kandidat
  #1
  Scenario: User dapat mencari data kandidat dengan nomor valid
#    Given User berhasil masuk ke dalam new page
    When User memasukkan data nomor kandidat ke search field
    And User klik search button
    Then Data nomor kandidat berhasil ditampilkan
    When User klik refresh button
#    Then Data kandidat berhasil direfresh