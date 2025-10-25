def FileReader():
    file = input("Insert path file: ").strip()
    try:
        with open(file, "r") as f:
            lines = f.readlines()
            lines = [line.strip() for line in lines]
        print(lines)
        return lines
    except FileNotFoundError:
        print("Error: file not found")
        return []
    except Exception as e:
        print(f"Unexpected error: {e}")
        return []
