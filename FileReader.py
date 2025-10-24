

def FileReader():
    file = "/home/scooperlosses/sample.txt"

    with open(file, "r") as f:
        lines = f.readlines()

    lines = [line.strip() for line in lines]
    print(lines)
    return lines

FileReader()


