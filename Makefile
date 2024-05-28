hello:
	echo "Hello World!"

test-build:
	docker compose -f ./compose.test.yaml build

test: test-build
	docker compose -f ./compose.test.yaml up

dev-watch:
	docker compose -f ./compose.dev.yaml up --build --watch

dev:
	docker compose -f ./compose.dev.yaml up --build

prod:
	docker compose up --build
