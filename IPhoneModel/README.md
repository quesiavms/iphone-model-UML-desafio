<!DOCTYPE html>
<html lang="pt">
<head>
    <meta charset="UTF-8">
    <title>Diagrama UML</title>
    <script type="module">
        import mermaid from 'https://cdn.jsdelivr.net/npm/mermaid/dist/mermaid.esm.min.mjs';
        mermaid.initialize({ startOnLoad: true });
    </script>
</head>
<body>
    <pre class="mermaid">
    classDiagram
        class iPhone {
            +ReprodutorMusical reprodutor
            +AparelhoTelefonico telefone
            +NavegadorInternet navegador
        }

        class ReprodutorMusical {
            +tocar()
            +pausar()
            +selecionarMusica(musica: String)
        }

        class AparelhoTelefonico {
            +ligar(numero: String)
            +atender()
            +iniciarCorreioVoz()
        }

        class NavegadorInternet {
            +exibirPagina(url: String)
            +adicionarNovaAba()
            +atualizarPagina()
        }

        iPhone --> ReprodutorMusical
        iPhone --> AparelhoTelefonico
        iPhone --> NavegadorInternet
    </pre>
</body>
</html>
