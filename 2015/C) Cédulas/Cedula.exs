# Incompleto
defmodule Cedula do
    
    def contarCedula(valor, cedula), do: { cedula, div(valor, cedula)}
    
    def contarCedulas(_, []), do: []
    def contarCedulas(valor, [cedula | cedulas]) do
        {nota, quantidade} = contarCedula(valor, cedula)
        
        [{nota, quantidade} | contarCedulas(valor - quantidade * nota, cedulas)]
    end
end

File.open! "numeros.in", [:read], fn(file) ->
    out = File.open! "numeros.out", [:write]

    IO.stream(file, :line) 
        |> Enum.each(&Numeros.run(&1,out))

    File.close(out)
end