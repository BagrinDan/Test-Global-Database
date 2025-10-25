from FileReader import FileReader
import requests


words = FileReader()

if not words:
    print("Aborting: no words to send.")
else:

    data = {"lines": words}
try:
    response = requests.post("http://localhost:8080/upload", json=data)
    print(response.status_code)
    print(response.text)
except requests.exceptions.ConnectionError:
    print("Error: Localhost (Spring) is shutdown. Can't connect")
except Exception as exception:
    print("Unexpected error " + str(exception))

