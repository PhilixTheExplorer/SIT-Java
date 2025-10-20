import os
import sys

# Number of markdown files to generate
num_files = int(sys.argv[1]) 
# Content template with a placeholder for question number
template = '''# Question {num}

![fig](../../img/fig)

Write a Java class named Account. 

## For example

| **Input**     | **Result** |
|:--------------|:-----------|
| ex | ex |
'''

# Output directory (optional)
output_dir = sys.argv[2] if len(sys.argv) > 2 else '.'

# Generate markdown files
for i in range(1, num_files + 1):
    filename = f'Question{i}.md'
    content = template.format(num=i)

    filepath = os.path.join(output_dir, filename)
    with open(filepath, 'w') as f:
        f.write(content)

    print(f"Generated: {filename}")
