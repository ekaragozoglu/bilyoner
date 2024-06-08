#!/bin/bash

if ! command -v mvn &> /dev/null
then
    echo "Maven is not installed. Attempting to install Maven..."
    if [[ "$OSTYPE" == "darwin"* ]]; then
        # macOS specific installation
        if ! command -v brew &> /dev/null
        then
            echo "Homebrew is not installed. Please install Homebrew first."
            exit 1
        fi
        brew install maven
    else
        echo "Unsupported OS for automatic Maven installation. Please install Maven manually."
        exit 1
    fi
else
    echo "Maven is already installed."
fi

mvn clean install
