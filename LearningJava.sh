#!/bin/bash

# Stop the script if any command fails
set -e

# Move to the repo directory
echo "Traveling to the coding dungeon... 🛤️"
cd /home/reddy/codes/Learning-Java

# Confirm Git repository status
if ! git rev-parse --is-inside-work-tree >/dev/null 2>&1; then
    echo "Error: Not inside a valid Git repository! Abort mission! 🚨"
    exit 1
fi

# Show Git status before changes
echo "Peeking into the vault... 🧐"
git status --short

# Add untracked and tracked files
echo "Stuffing your genius into the Git bag... 🛍️"
git add -A

# Check for changes to be committed
if git diff --cached --quiet; then
    echo "Your code is too perfect. Nothing to commit! 🏖️"
    exit 0
fi

# Commit the changes
commit_message="Auto-update: $(date +"%Y-%m-%d %H:%M:%S")"
echo "Sealing the deal with message: '$commit_message' 🔐"
git commit -m "$commit_message"

# Push changes to the repository
echo "Launching your code into the GitHub stratosphere 🚀..."
git push

echo "All done! Time to bask in the glory of automation ✨"

