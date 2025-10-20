def convert_input_to_br():
    print("Paste your text (finish input by pressing Enter twice):")
    lines = []
    while True:
        line = input()
        if line == "":
            break
        lines.append(line)
    
    # Join with <br>
    result = " <br> ".join(lines)
    print("\nConverted text:")
    print(result)

if __name__ == "__main__":
    convert_input_to_br()
