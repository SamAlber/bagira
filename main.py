import os
from datetime import datetime

def main():
    # Message to display and write to the file
    message = "Hello, Azure Pipeline!"
    output_file = "output.txt"

    # Print message to console
    print(message)

    # Write message and timestamp to output.txt
    with open(output_file, "w") as file:
        file.write(f"{message}\nGenerated on: {datetime.now()}")

    print(f"Message written to {output_file}")


if __name__ == "__main__":
    main()
