defmodule Pedras do
    def run(sizes, out) do
        sizes = String.trim sizes

        unless sizes == "0" do
            res = sizes
            |> String.split()
            |> calculate

            IO.binwrite out, "#{res}\n"
        end
    end

    def calculate(col_row) do 
        { col, row } = col_row
        |> Enum.map(fn(num) -> 
                Float.parse(num) 
                |> elem(0) 
                |> (fn(num) -> num / 2 end).()
                |> Float.round
            end)
        |> List.to_tuple

        (col * row) |> Kernel.trunc
    end
end

File.open! "pedras.in", [:read], fn(file) ->
    out = File.open! "pedras.out", [:write]

    IO.stream(file, :line) |> Enum.each(&Pedras.run(&1,out))

    File.close(out)
end
