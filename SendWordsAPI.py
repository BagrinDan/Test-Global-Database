import requests
from FileReader import FileReader



words = FileReader()

data = {"lines": words}

response = requests.post("http://localhost:8080/upload", json=data)

print(response.status_code)
print(response.text)