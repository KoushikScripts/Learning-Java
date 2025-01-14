#!/bin/bash

# stop the script if any command fails
set -e

# move to the repo directory
cd /home/reddy/codes/Learning-Java

# confirm Git repository status
if ! git rev-parse --is-inside-work-tree >/dev/null 2>&1; then
    echo "Error: Not inside a valid Git repository!"
    exit 1
fi

# show Git status before changes
echo "Checking repository status..."
git status --short

# add untracked and tracked files
echo "Adding all changes and new files..."
git add -A

# check for changes to be committed
if git diff --cached --quiet; then
    echo "No changes detected to commit. Exiting."
    exit 0
fi

# commit the changes
commit_message="Auto-update: $(date +"%Y-%m-%d %H:%M:%S")"
echo "Committing changes with message: $commit_message"
git commit -m "$commit_message"

# push changes to the repository
echo "Pushing changes to remote..."
git push

echo "Push Done!"
