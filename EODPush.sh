#!/bin/bash

# ensure the script stops on error
set -e

# change directory to Obsidian vault
cd /home/reddy/codes/Learning-Java

# check for any changes
if git diff --quiet && git diff --cached --quiet; then
    echo "No changes to commit. Exiting."
    exit 0
fi

# stage all changes
git add -A

# commit with a timestamp
commit_message="Auto-update: $(date +"%Y-%m-%d %H:%M:%S")"
git commit -m "$commit_message"

# push changes
git push