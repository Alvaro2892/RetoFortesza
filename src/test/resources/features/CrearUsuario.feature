Feature: Yo como usuario quiero crear una cuenta en el sitio web de Fortesza

  Scenario: Entrar al sitio web y crear un usuario
    Given Dado que un usuario entra al sitio web de la empresa y quiero crear un usuario
    When el usuario crea la cuenta y esta disponible para usar los beneficios
      | email             | password   |
      | alvaro28@reto.com | Reto2023$# |
    Then El usuarioverifica que el usuario se creo correctamente Elige tu plan