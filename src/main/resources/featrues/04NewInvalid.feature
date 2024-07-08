Feature: User Filter Data Kandidat
  #1
  Scenario: User tidak dapat memfilter data kandidat dengan tanggal invalid
    Given Admin berhasil masuk ke dalam new page
    When Admin memilih start date yang invalid
    And Admin memilih end date yang invalid
    And Admin klik filter button
    Then Data kandidat berhasil ditampilkan