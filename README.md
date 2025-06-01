# Simulador iPhone 2007

Reprodução das funcionalidades apresentadas no lançamento do iPhone em 2007.

## 📊 Diagrama UML

```mermaid

classDiagram
  classDiagram
  class IPhone {
    + tocar()
    + pausar()
    + selecionarMusica(String musica)
    + ligar(String numero)
    + atender()
    + iniciarCorreioVoz()
    + exibirPagina(String url)
    + adicionarNovaAba()
    + atualizarPagina()
  }

  class ReprodutorMusical {
    <<interface>>
    + tocar()
    + pausar()
    + selecionarMusica(String musica)
  }

  class AparelhoTelefonico {
    <<interface>>
    + ligar(String numero)
    + atender()
    + iniciarCorreioVoz()
  }

  class NavegadorInternet {
    <<interface>>
    + exibirPagina(String url)
    + adicionarNovaAba()
    + atualizarPagina()
  }

  IPhone ..|> ReprodutorMusical
  IPhone ..|> AparelhoTelefonico
  IPhone ..|> NavegadorInternet