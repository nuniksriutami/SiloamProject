Feature: Update Data Sales Dua Kombinasi

  Scenario Outline: Admin dapat berhasil menambahkan data kandidat
    When Admin masuk ke menu Input
    And Admin Melakukan Update Pada <nama>, <nomorBPJS>, <nomorKTP>, <address>, <kotaKTP>, <faskesAwal>, <faskesTujuan> dan <alasan>
    And Admin tekan tombol Simpan
    Then Data kandidat ditambahkan ke sistem dengan informasi yang sesuai

  #28 data
    Examples:
      |nama|nomorBPJS|nomorKTP|address|kotaKTP|faskesAwal|faskesTujuan|alasan|
      |Nunik|1134567898788|||||||
      |Nunik||1634567654321233||||||
      |Nunik|||Padang|||||
      |Nunik||||KOTA PADANG||||
      |Nunik|||||Klinik Test|||
      |Nunik||||||Tangerang||
      |Nunik|||||||Test|
      ||1134567898788|1934567654321238||||||
      ||1134567898788||Padang|||||
      ||1134567898788|||KOTA PADANG||||
      ||1134567898788||||Klinik Test|||
      ||1134567898788|||||Tangerang||
      ||1134567898788||||||Test|
      |||1934567654321238|Padang|||||
      |||1934567654321238||KOTA PADANG||||
      |||1934567654321238|||Klinik Test|||
      |||1934567654321238||||Tangerang||
      |||1934567654321238|||||Test|
      ||||Padang|KOTA PADANG||||
      ||||Padang||Klinik Test|||
      ||||Padang|||Tangerang||
      ||||Padang||||Test|
      |||||KOTA PADANG|Klinik Test|||
      |||||KOTA PADANG||Tangerang||
      |||||KOTA PADANG|||Test|
      ||||||Klinik Test|Tangerang||
      ||||||Klinik Test||Test|
      |||||||Tangerang|Test|