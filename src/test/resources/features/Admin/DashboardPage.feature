Feature: Dashboard Page

  @Positive
  Scenario Outline: Dasboard Page Flow Valid Service Type and Price
    Given Already log in
    When Click detail button
    And Input text in add service type "<servicetype>"
    And Input price in add price "<price>"
    And Click submit button
    And Click change status field
    Then Back to dashboard page
    Examples:
    | servicetype      | price  |
    | Change Break     | 8000   |
    | Tune Up          | 110000 |
    | Complete Service | 45000  |

  @Negative
  Scenario Outline: Dasboard Page Flow Invalid Service Type and Price
    Given Already log in
    When Click detail button
    And Input text in add service type "<servicetype>"
    And Input price in add price "<price>"
    And Click submit button
    And Click change status field
    Then Back to dashboard page
    Examples:
      | servicetype      | price       |
      | Nasi goreng      | 356770123   |
      | Sop Ayam         | 138291863   |
      | Semur            | 1237129379  |
