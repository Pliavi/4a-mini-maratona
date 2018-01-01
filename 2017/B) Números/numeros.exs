defmodule Numeros do
    def run(numero, out) do
        numero = String.trim numero
        unless numero == "0" do
            { milhar , numero  } = divisao_direta(numero, 1000)
            { centena, numero  } = divisao_direta(numero, 100)
            { dezena , unidade } = divisao_direta(numero, 10)

            IO.binwrite out, "#{milhar} #{centena} #{dezena} #{unidade}\n"
        end
    end

    def divisao_direta(numero, multiplicador) when is_binary(numero) do
        divisao_direta(String.to_integer(numero), multiplicador)
    end

    def divisao_direta(numero, multiplicador) do
        resultado = Kernel.trunc(Float.floor(numero / multiplicador)) * multiplicador
        resto = numero - resultado

        { resultado, resto }
    end
end

File.open! "numeros.in", [:read], fn(file) ->
    out = File.open! "numeros.out", [:write]

    IO.stream(file, :line) |> Enum.each(&Numeros.run(&1,out))

    File.close(out)
end