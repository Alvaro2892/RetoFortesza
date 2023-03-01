Feature: Yo como usuario quiero entrar al sitio web y navegar

  Scenario: Login y navegar por el sitio
    Given dado que ingreso a la pagina
    When el hace login y navega por la pagina
      | email                    | password      |
      | erasmotorres09@gmail.com | esFortesza21* |
    Then verifica que esta navegando correctamente en la opcion Recargar saldo